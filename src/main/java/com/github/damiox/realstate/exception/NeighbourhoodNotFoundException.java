package com.github.damiox.realstate.exception;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Exception when Neighbourhood is not found.
 *
 * @author dnardelli
 */
public class NeighbourhoodNotFoundException extends RuntimeException implements GraphQLError {

    private Map<String, Object> extensions = new HashMap<>();

    public NeighbourhoodNotFoundException(String message, Long invalidNeighbourhoodId) {
        super(message);
        extensions.put("invalidNeighbourhoodId", invalidNeighbourhoodId);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.DataFetchingException;
    }

    @Override
    public Map<String, Object> getExtensions() {
        return extensions;
    }

}
