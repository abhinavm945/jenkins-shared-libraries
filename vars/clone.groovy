def call(String url, String branch){
   echo 'Cloning...'
   git url: "${url}", branch: "${branch}"
   echo "Code clone successful"
}
