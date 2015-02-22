<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<div class="modal fade" id="myModal" hidden="true" tabindex="-1"
		role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title"></h4>
				</div>
				<div class="modal-body">
					<form id="transactionForm" action="/ExpenseManager/income" method="post">
						<div id="hiddenId"></div>
						<div class="form-group">
						
							<label for="amount">Amount</label> <input name="amount"
								type="text" class="form-control" id="amount"
								placeholder="Enter amount" data-validation="number" data-validation-allowing="float">
						</div>
						<div class="form-group">
							<label for="tag">Tag</label> <input type="text" name="tag"
								class="form-control" id="tag" placeholder="Enter tag" data-validation="required">
						</div>
						<div class="form-group">
							<label for="transactionDate">Transaction Date</label> <input
								type="text" class="form-control" id="transactionDate"
								name="transactionDate" placeholder="Enter transaction date as mm/dd/yyyy" data-validation="date" data-validation-format="mm/dd/yyyy">
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<input type="submit" value="Save" class="btn btn-primary">
						</div>
					</form>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>