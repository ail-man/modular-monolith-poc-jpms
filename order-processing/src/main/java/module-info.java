module com.example.monolith.jpms.orderprocessing {
	exports com.example.monolith.jpms.orderprocessing.api;
	requires com.example.monolith.jpms.usermanagement;
	requires com.example.monolith.jpms.productcatalog;
}