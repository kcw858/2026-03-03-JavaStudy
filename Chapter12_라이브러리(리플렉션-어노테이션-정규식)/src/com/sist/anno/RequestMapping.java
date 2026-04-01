package com.sist.anno;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
/*	
 * 	@RequestMapping("aaa")
 *  aaa()
 *  @RequestMapping("bbb")
 *  bbb()
 *  @RequestMapping("ccc")
 *  ccc()
 *  
 *  ---->어노테이션이 같으면 못찾기 때문에 구분자를 줘야한다
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface RequestMapping {
	public String value(); // 구분자
}
