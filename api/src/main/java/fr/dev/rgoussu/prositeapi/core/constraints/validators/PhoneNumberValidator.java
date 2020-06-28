package fr.dev.rgoussu.prositeapi.core.constraints.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;

import fr.dev.rgoussu.prositeapi.core.constraints.annotations.PhoneNumber;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

    private static String DEFAULT_REGION="FR";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean result = true;
        try{
            com.google.i18n.phonenumbers.Phonenumber.PhoneNumber number = PhoneNumberUtil.getInstance().parse(value, DEFAULT_REGION);
            result = PhoneNumberUtil.getInstance().isValidNumber(number);
        } catch(NumberParseException e){
            result = false;
        }
        return result;
    }

}
