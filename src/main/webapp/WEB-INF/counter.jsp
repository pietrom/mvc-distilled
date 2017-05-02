<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<p>
	Counter value is: ${counterValue}
	<form action="/mvc-distilled/counter">
		<input type="submit">Increment</input>
	</form>
</p>