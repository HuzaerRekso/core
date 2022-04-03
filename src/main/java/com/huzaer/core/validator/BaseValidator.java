package com.huzaer.core.validator;

import com.huzaer.core.exception.ApplicationException;
import com.huzaer.core.payload.Status;
import org.springframework.util.StringUtils;

/**
 * This class is a used for a base of basic validation
 *
 * @author  Mohammad Huzaer Rekso Jiwo
 * @version 0.1
 * @since   2022-04-02
 */
public class BaseValidator {

    public static final String _REGEX_ALPHABETH_SPACE = "[A-Za-z ]*";

    public Status invalidMsg(String message) {
        return Status.INVALID(message);
    }

    protected void notBlank(String value, String message) {
        if (!StringUtils.hasLength(value)) {
            throw new ApplicationException(invalidMsg(message));
        }
    }

    protected void notNull(Object value, String message) {
        if (value == null) {
            throw new ApplicationException(invalidMsg(message));
        }
    }

    protected void isAlphabetSpace(String value, String message) {
        if (StringUtils.hasLength(value) && !value.matches(_REGEX_ALPHABETH_SPACE)) {
            throw new ApplicationException(invalidMsg(message));
        }
    }

    protected void isMax(String value, int length, String message) {
        if (StringUtils.hasLength(value) && value.length() > length) {
            throw new ApplicationException(invalidMsg(message));
        }
    }
}
