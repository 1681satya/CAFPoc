//Do not edit this file by hand
var MDakk_testdummytasks_module = angular.module('MDakk-ED595AE0-76D2-1034-B001-1', ['adf.provider'])
  .config(function(dashboardProvider){
    dashboardProvider
      .widget('mdakk', {
        title: 'k',
        editTitle :'',
        description: '',
        templateUrl: '/testdummytasks/MDakk/views/view.xhtml',
        controller: 'MDakk_testdummytasks_Controller',
        controllerAs: 'MDakk',
        edit: {
          templateUrl: '/testdummytasks/MDakk/views/settings.xhtml'
        },
        application : "testdummytasks",
        widgetName : "mdakk",
        defaults:{ "title": "MDakk",
  	      "structure": "6-6",
  	      "rows": [{
  	        "columns": [{
  	          "styleClass": "col-md-12",
  	          "widgets": [ {
  	              "type": "mdakk",
  	              "title": "",
  	              "config": {
  	            	  "params":{
  	            	         
                                },
  	            	  "title":""
  	              	}
  	            }]
  	        }]
  	      }]
  	  }
              });
  });
