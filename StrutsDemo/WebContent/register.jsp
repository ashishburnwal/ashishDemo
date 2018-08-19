<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<<html:javascript formName="rf"/>


<html:form action="register" onsubmit="return validateRF(this)">

<bean:message key="my.username"/>Username:<html:text property="username"/>
<bean:message key="my.username"/>Password:<html:text property="password"/>
<html:submit value="Register"/>

</html:form>
