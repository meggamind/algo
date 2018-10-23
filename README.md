function kotlinr() {
   echo Compiling, please wait...
   kotlinc $1 -include-runtime -d out.jar
   java -jar out.jar
 }

Add this to ~/.bash_profile and then run kotlinr file.kt to compile and run the program  
