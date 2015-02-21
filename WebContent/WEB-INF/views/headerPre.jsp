<div class="navbar navbar-inverse">
	<div class="navbar-header">
		<button type="button" class="navbar-toggle" data-toggle="collapse"
			data-target=".navbar-inverse-collapse">
			<span class="icon-bar"></span> <span class="icon-bar"></span> <span
				class="icon-bar"></span>
		</button>
		<a class="navbar-brand" href="/ExpenseManager">Expense Manager</a>
	</div>
	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

		<ul class="nav navbar-nav navbar-right">
			<li><form action="signin" method="POST" class="navbar-form">
					<div class="form-group">
						<input type="email" class="form-control" placeholder="Email"
							name="email">
					</div>
					<div class="form-group">
						<input type="password" class="form-control" placeholder="Password"
							name="password">
					</div>
					<button type="submit" class="btn btn-danger">Sign In</button>
				</form></li>
			<li><a href="/ExpenseManager/register">Register</a></li>

		</ul>
	</div>
</div>
