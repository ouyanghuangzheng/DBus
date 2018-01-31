package com.creditease.dbus.commons.log.processor.parse;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/9/19.
 */
public class RuleGrammar implements Serializable{

    private String ruleParamter;

    private String ruleOperate;

    private String ruleScope;

    private String name;

    //算子类型
    private String type;

    //规则类型：字符串、正则表达式或索引类型
    private String ruleType;

    //sub算子需要单独处理
    private String subStart;

    private String subEnd;

    private String subStartType;

    private String subEndType;

    private String filterKey;


    public String getSubStart() {
        return subStart;
    }

    public void setSubStart(String subStart) {
        this.subStart = subStart;
    }

    public String getSubEnd() {
        return subEnd;
    }

    public void setSubEnd(String subEnd) {
        this.subEnd = subEnd;
    }

    public String getSubStartType() {
        return subStartType;
    }

    public void setSubStartType(String subStartType) {
        this.subStartType = subStartType;
    }

    public String getSubEndType() {
        return subEndType;
    }

    public void setSubEndType(String subEndType) {
        this.subEndType = subEndType;
    }

    public String getRuleParamter() {
        return ruleParamter;
    }

    public void setRuleParamter(String ruleParamter) {
        this.ruleParamter = ruleParamter;
    }

    public String getRuleOperate() {
        return ruleOperate;
    }

    public void setRuleOperate(String ruleOperate) {
        this.ruleOperate = ruleOperate;
    }

    public String getRuleScope() {
        return ruleScope;
    }

    public void setRuleScope(String ruleScope) {
        this.ruleScope = ruleScope;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public String getFilterKey() {
        return filterKey;
    }

    public void setFilterKey(String filterKey) {
        this.filterKey = filterKey;
    }
}
