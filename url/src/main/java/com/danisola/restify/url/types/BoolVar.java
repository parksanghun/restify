package com.danisola.restify.url.types;

public class BoolVar extends AbstractVarType<Boolean> {

    public static BoolVar boolVar(String id) {
        return new BoolVar(id);
    }

    public static BoolVar boolVar(String id, String regex) {
        return new BoolVar(id, regex);
    }

    private BoolVar(String id) {
        super(id);
    }

    private BoolVar(String id, String regex) {
        super(id, regex);
    }

    @Override
    public Boolean convert(String value) {
        return Boolean.parseBoolean(value);
    }
}
