package com.cl.common.execption;

import com.cl.common.result.ResponseEnum;
import com.cl.common.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author chenglei
 * @create 2021-08-31 17:01
 */
@RestControllerAdvice
@Slf4j
@Component
public class UnifiedExceptionHandler {

    //未定义异常
    @ExceptionHandler(value = Exception.class)
    public Result handleException(Exception e){
        log.error(e.getMessage(),e);
        return Result.error();
    }

    /**
     * 特定异常
     */
    @ExceptionHandler(BadSqlGrammarException.class)
    public Result handleBadSqlGrammarException(BadSqlGrammarException e){
        log.error(e.getMessage(), e);
        return Result.setResult(ResponseEnum.BAD_SQL_GRAMMAR_ERROR);
    }

    /**
     * 自定义异常
     */
    @ExceptionHandler(BusinessException.class)
    public Result handleBusinessException(BusinessException e){
        log.error(e.getMessage(), e);
        return Result.error().message(e.getMessage()).code(e.getCode());
    }
}
