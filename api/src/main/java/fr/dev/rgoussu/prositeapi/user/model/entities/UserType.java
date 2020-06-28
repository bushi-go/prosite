package fr.dev.rgoussu.prositeapi.user.model.entities;

import java.util.Arrays;
import java.util.NoSuchElementException;

import lombok.Getter;

public enum UserType {
    VISITOR("VIS"), CANDIDATE("CDT"), RECRUITER("RCR");


    @Getter
    private String code;
    private UserType(String value) {
        this.code = value;
    }

    public static UserType fromCode(String code){
        return Arrays.stream(UserType.values())
                        .filter(ust -> ust.getCode().equals(code))
                        .findFirst()
                        .orElseThrow(()-> new NoSuchElementException("No such user type "+ code));
    }

    public static class Values{
        public static String VISITOR =  "VIS";

        public static String CANDIDATE =  "CDT";

        public static String RECRUITER =  "RCR";
    }
}