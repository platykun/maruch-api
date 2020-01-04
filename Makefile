update-api:
	swagger-codegen generate -l spring -c spring-config.json -i ../api-design/swagger/index.yaml -o ./generate
	rm -rf src/main/java/maruch/swagger/api/
	mv -f  generate/src/main/java/maruch/swagger/* src/main/java/maruch/swagger/api/

