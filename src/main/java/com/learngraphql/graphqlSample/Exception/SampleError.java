package com.learngraphql.graphqlSample.Exception;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.schema.DataFetchingEnvironment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SampleError extends DataFetcherExceptionResolverAdapter {

    @Override
    protected GraphQLError resolveToSingleError(Throwable ex, DataFetchingEnvironment env) {

        ex.printStackTrace();
        return GraphQLError.newError().errorType(ErrorType.DataFetchingException).build();
    }
}
