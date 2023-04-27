package by.tms.myshop.utils;

import by.tms.myshop.exceptions.ValidationException;

import static org.apache.commons.lang3.StringUtils.isBlank;

public class HttpRequestParamValidator {

    private static final String REQUEST_PARAMETER_IS_NULL_ERROR = "Request parameter is not initialized!";

    public static void validateParamNotNull(String param) throws ValidationException {
        if (isBlank(param)) {
            throw new ValidationException(REQUEST_PARAMETER_IS_NULL_ERROR);
        }
    }
}