package com.example.harshit.crudharshit;

/**
 * Created by Harshit on 19-01-2017.
 */
public class Config {
    
    //Address of our scripts of the CRUD
    public static final String URL_ADD="http://192.168.225.213/harshit/addEmp.php";
    public static final String URL_GET_ALL = "http://192.168.225.213/harshit/getAllEmp.php";
    public static final String URL_GET_EMP = "http://192.168.225.213/harshit/getEmp.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.168.225.213/harshit/updateEmp.php";
    public static final String URL_DELETE_EMP = "http://192.168.225.213/harshit/deleteEmp.php?id=";

    //Keys that will be used to send the request to php scripts
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAME = "name";
    public static final String KEY_EMP_DESG = "desg";
    public static final String KEY_EMP_SAL = "salary";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAME = "name";
    public static final String TAG_DESG = "desg";
    public static final String TAG_SAL = "salary";

    //employee id to pass with intent
    public static final String EMP_ID = "emp_id";
}