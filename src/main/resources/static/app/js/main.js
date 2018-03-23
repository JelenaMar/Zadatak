var app = angular.module("Cripto", ['ngRoute']);

/*
app.controller("CriptoCtrl", function($scope, $http, $location) {
	var baseUrl = "https://api.coinmarketcap.com/v1/ticker/";
	$scope.criptocurrency = [];
	
	var getCripto = function() {
		$http.get(baseUrl).then(
				function succes(res) {
					for(let data of res.data) {
						newCripto = {};
						newCripto.name = data.name;
						newCripto.symbol = data.symbol;
						newCripto.rank = data.rank;
						newCripto.priceInUsd = data.price_usd;
						newCripto.priceInbitcoin = data.price_btc;
						newCripto.dayvolume = data.24h_volume_usd;
						newCripto.marketcup = data.market_cap_usd;
						newCripto.availableSupply = data.available_supply;
						newCripto.totalSupply = data.total_supply;
						newCripto.oneHchange = data.percent_change_1h;
						newCripto.daychange = data.percent_change_24h;
						newCripto.sevenDchange = data.percent_change_7d;
						$scope.criptocurrency.push(newCripto);
					}
				},
				function error(res) {
					alert("Something went wrong!");
				}
		);
	}
	
	
	getCripto();
	
	$scope.saljiValuteUBazu = function() {
		var baseUrl = "/api/details";
		var CriptoBase = {};
		for(let val of $scope.criptocurrency) {
			
			var CriptoBase = {};
			CriptoBase.name = val.name;
			CriptoBase.symbol = val.symbol;
			CriptoBase.rank = val.rank;
			CriptoBase.priceInUsd = val.price_usd;
			CriptoBase.priceInbitcoin = val.price_btc;
			CriptoBase.dayvolume = val.24h_volume_usd;
			CriptoBase.marketcup = val.market_cap_usd;
			CriptoBase.availableSupply = val.available_supply;
			CriptoBase.totalSupply = val.total_supply;
			CriptoBase.oneHchange = val.percent_change_1h;
			CriptoBase.daychange = val.percent_change_24h;
			CriptoBase.sevenDchange = val.percent_change_7d;
			
			$http.post(baseUrl, CriptoBase).then(
					function succes(res) {
						console.log("succes");
					},
					function error(res) {
						alert("Something went wrong!");
					}	
			);
		}
	}
	
	var posaljiUBazu = function() {
		$scope.saljiValuteUBazu();
	}
	posaljiUBazu();
});
*/


app.controller("editCtrl",function($scope,$http,$routeParams){
	
	var baseUrlItem= "/api/coinmarket";
	
	
	
	$scope.items = [];
	
	
	
	var getItems = function(){
		$http.get(baseUrlItem).then(
			function success(res){
				$scope.items = res.data;
				
			},
			function error(res){
				alert("Something went wrong!");
			}
		);
	}
	

	getItems();
	
	
	
});
app.controller("editdetailsCtrl", function($scope, $http, $location, $routeParams) {
	
	var id = $routeParams.itemId;
	var baseUrlDetails = "/api/details";
	
	
	$scope.detail = {};
	$scope.detail.name = "";
	$scope.detail.symbol = "";
	$scope.detail.rank = "";
	$scope.detail.priceInUsd = "";
	$scope.detail.priceInbitcoin = "";
	$scope.detail.dayvolume = "";
	$scope.detail.marketcup = "";
	$scope.detail.availableSupply = "";
	$scope.detail.totalSupply = "";
	$scope.detail.oneHchange = "";
	$scope.detail.daychange = "";
	$scope.detail.sevenDchange = "";
	
	
	
	var getDetails = function() {
		$http.get(baseUrlDetails +"/" + id).then(
				function success(res){
					$scope.detail = res.data;
				},
				function error(res){
					alert("Something went wrong!");
				}
		);
	}
	
	getDetails();
});


app.config(['$routeProvider', function($routeProvider) {
	$routeProvider
		.when('/', {
			templateUrl : '/app/html/home.html',
			
		})
		.when('/details/:itemId', {
			templateUrl : '/app/html/editdetails.html'
		})
		.when('/edit', {
			templateUrl : '/app/html/criptocurrency-edit.html'
		})
		.when('/push', {
			templateUrl : '/app/html/dodajUbazu.html'
		})
		.otherwise({
			redirectTo: '/'
		});
}]);

