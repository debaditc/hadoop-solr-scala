data.collect()
//res1: Array[String] = Array(key^value, ABC^5662442, XYZ^5662442, XLI^2345, XLV^12345, XLA^12345, ABS^11)

//Use of map to split strings
data.map(_.split("\\^")).collect()
//res2: Array[Array[String]] = Array(Array(key, value), Array(ABC, 5662442), Array(XYZ, 5662442), Array(XLI, 2345), Array(XLV, 12345), Array(XLA, 12345), Array(ABS, 11222))

//Use of flatMap
data.flatMap(_.split("\\^")).collect()
//res3: Array[String] = Array(key, value, ABC, 5662442, XYZ, 5662442, XLI, 2345, XLV, 12345, XLA, 12345, ABS, 11222)

//Use map to get add string "_data" in 1st field
data.map(_.split("\\^")).map{ x => (x(0)+"_data",x(1)) }.collect()
//res5: Array[(String, String)] = Array((key_data,value), (ABC_data,5662442), (XYZ_data,5662442), (XLI_data,2345), (XLV_data,12345), (XLA_data,12345), (ABS_data,11222))

