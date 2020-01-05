
var app = angular.module("MyApp",[]);

(function(){
    "use strict";
    app.controller('ctrl', function($scope, $http, $location) {

    	var vm = $scope;
    	vm.AllMatches = null;
    	vm.heading = "Matches";

    	vm.showAllMatches = true;
    	vm.showTeam = false;
    	vm.showPlayer = false;

		vm.getAllMatches = function(){
    	vm.showAllMatches = true;
    	vm.showTeam = false;
    	vm.showPlayer = false;
    	vm.showMatch = false;

    	vm.heading = "Matches";

        $http.get('http://localhost:2121/cricket/').then(function(response){
        	vm.AllMatches = response.data;

        });

		}

		if(vm.showAllMatches){
			vm.getAllMatches();
		}

        vm.getMatchDetail = function(match){
        	vm.heading = 'Match Details';
        	vm.selectedMatch = match;
	    	vm.showAllMatches = false;
	    	vm.showMatch = true;
    		vm.showTeam = false;
	    	vm.showPlayer = false;
	        $http.get('http://localhost:2121/cricket/byTeamName/'+match.team_name1).then(function(response){
	        	vm.TeamData1 = response.data;

	        });
	        $http.get('http://localhost:2121/cricket/byTeamName/'+match.team_name2).then(function(response){
	        	vm.TeamData2 = response.data;

	        });

        }

        vm.getPlayerDetail = function(id){

        	vm.heading = 'Player Details';
	    	vm.showAllMatches = false;
	    	vm.showMatch = false;
    		vm.showTeam = false;
	    	vm.showPlayer = true;
	        $http.get('http://localhost:2121/cricket/byPlayerId/'+id).then(function(response){
	        	vm.Player = response.data;

	        });
        }

        vm.getTeamDetail = function(name){

        	vm.heading = 'Team Details';
	    	vm.showAllMatches = false;
    		vm.showTeam = true;
	    	vm.showPlayer = false;
	    	vm.showMatch = false;
	        $http.get('http://localhost:2121/cricket/byTeamName/'+name).then(function(response){
	        	vm.TeamDetails = response.data;

	        });
        }



    });
})();