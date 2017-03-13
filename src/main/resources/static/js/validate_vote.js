$(document).ready(function () {
	
	
	
	/*$(".clsVote").click(function () {
		alert("checked:" + $('.clsVote:checkbox:checked'))
	})*/
	
	/*$('input[type="checkbox"]').click(function() {
	    alert("you click one of the listed checkbox?");
		//var checkedCount = $(".clsVote:checked").length;
		//alert(checkedCount);
	});*/
	
	
	/*$('.clsVote').change(function() {
		var checkedCount = $(".clsVote:checked").length;
		alert(checkedCount);
	});*/
	    

	$("#root_id input:checkbox").on("change", function() {
		//alert('in')
		//var checkedCount = $(".clsVote:checked").length;
		var checkedCount = $("input[name='nmvote']:checked").length;
		
	    if(checkedCount == 3)
	        $('input[name="nmvote"]:not(:checked)').attr('disabled', 'disabled');
	    else
	        $('input[name="nmvote"]').removeAttr('disabled');

		//alert(checkedCount);
	});
});