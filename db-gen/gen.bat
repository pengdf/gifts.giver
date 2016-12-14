echo 正在生成Mybatis文件....

java -jar -Dfile.encoding=UTF-8 ./lib/mybatis-generator-1.3.2.jar -configfile generator.xml  -overwrite 
echo Mybatis文件生成成功!

pause
exit