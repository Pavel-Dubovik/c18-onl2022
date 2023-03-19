package by.teachmeskills.eshop.utils;

import by.teachmeskills.eshop.exceptions.ValidationException;

import java.util.Optional;

public class HttpRequestParamValidator {

    private static final String REQUEST_PARAMETER_IS_NULL_ERROR = "Request parameter is not initialized!";

    public static void validateParamNotNull(String param) throws ValidationException {
        if (Optional.ofNullable(param).isEmpty()) {
            throw new ValidationException(REQUEST_PARAMETER_IS_NULL_ERROR);
        }
    }
}
