<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="cp" value="${pageContext.request.contextPath}" />

<div class="container">
	<!-- container start -->
	<div class="row">
		<!-- row Start -->

		<div class="col-lg-3">
			<!-- empty column for space from right -->
		</div>
		<div class="col-lg-6">
			<!-- col Start -->
			<article role="login">
				<h3 class="text-center">
					<i class="fa fa-lock"></i>Add Job
				</h3>

				<form:form method="POST" action="${cp}/insert" modelAttribute="job">

					<div class="form-group">
						<form:input path="jobId" type="text"/>
					</div>

					<div class="form-group">
						<form:input path="jobTitle" class="form-control" placeholder="JobTitle" />
					</div>
					<div class="form-group">
						<form:input path="jobDesc" type="text" class="form-control" placeholder="Job Description" />
					</div>
					<div class="form-group">
						<form:input path="location" type="text" class="form-control" placeholder="Job location" />
					</div>
					<div class="form-group">
						<form:input path="technology" type="text" class="form-control" placeholder="Add technology" />
					</div>
					<div class="form-group" align="center">
						<input type="submit" class="btn btn-primary btn-md btn-block" value="Save">
					</div>

				</form:form>

			</article>
		</div>
		<!-- col over -->

		<div class="col-lg-3">
			<!-- empty column for space from left -->
		</div>

	</div>
	<!-- Row over -->

</div>
<!-- Contain over -->






