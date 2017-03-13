$(document).ready(function () {
	$("#root_id input:checkbox").on("change", function() {
		var checkedCount = $("input[name='nmvote']:checked").length;
		
	    if(checkedCount == 3)
	        $('input[name="nmvote"]:not(:checked)').attr('disabled', 'disabled');
	    else
	        $('input[name="nmvote"]').removeAttr('disabled');
	});
});