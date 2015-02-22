$(function() {
	var isClicked = "false";
	
	$('#editTrans').click(function() {
		isClicked = "true";
	});
	
	$('#myModal').on('show.bs.modal', function (event) {
		  var button = $(event.relatedTarget) // Button that triggered the modal
		  var tag = button.data('tag');
		  var amount = button.data('amount');
		  var transactionDate = button.data('transactiondate');
		  var transactionId = button.data('transactionid');
		  var modal = $(this);
		  
		  if(isClicked === "true") {
			  modal.find('.modal-title').text('Edit Income')
			  modal.find('.modal-body #amount').val(amount);
			  modal.find('.modal-body #tag').val(tag);
			  modal.find('.modal-body #transactionDate').val(transactionDate);
			  modal.find('.modal-body #hiddenId').html('<input type="hidden" name="transactionId" value="'+transactionId+'" />');
			  isClicked = "false";
		  }else{
			  modal.find('.modal-title').text('Add Income')
			  modal.find('.modal-body #amount').val("");
			  modal.find('.modal-body #tag').val("");
			  modal.find('.modal-body #transactionDate').val("");
			  modal.find('.modal-body #hiddenId').html();
			  isClicked = "false";
		  }
		
		});
	
	
	
})


