/** 
 * @Project Name : LuckyExp
*
* @File name : VariableToken.java
*
* @Author : FayeWong
*
* @Email : 50125289@qq.com
*
----------------------------------------------------------------------------------
*    Who        Version     Comments
* 1. FayeWong    1.0         表示表达式中使用的setvariable
*
*
*
*
----------------------------------------------------------------------------------
*/
package org.lucky.exp.tokenizer;

/**
 * <p>变量对象<p>
 * @author FayeWong
 * @since  1.0
 * 
 */
public class VariableToken extends Token {
    private final String name;

    /**
     * 获取集合变量的名称
     * @return the 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 命名集合变量的名称
     */
    public VariableToken(String name) {
        super(TOKEN_VARIABLE);
        this.name = name;
    }
}
