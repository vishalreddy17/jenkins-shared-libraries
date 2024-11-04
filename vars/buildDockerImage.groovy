def call(String image_version) {
    echo "Building docker image"
    docker build -t my-image .
    docker image tag my-image another-image:$image_version
}
