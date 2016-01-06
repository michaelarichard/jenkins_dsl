#/bin/sh
LUST=sea-dev3-vmc-default1.istockphoto.com
#LIST=`echo "select IP from siteenv.tbl_SS_Server where Type='memcache';" | mysql -N | grep 10.223` 
for i in $LIST ; do 
echo "flush_all" | nc $i 11211
done

