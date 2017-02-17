package com.adisap.crud;

/**
 * Created by Harshit on 06-01-2017.
 */

public class Config {
    //URL for each sql CRUD operation
    public static final String URL_addEmp="http://localhost/Harshit/addEmp.php";
    public static final String URL_dbConnect="http://localhost/Harshit/dbConnect.php";
    public static final String URL_deleteEmp="http://localhost/Harshit/deleteEmp.php";
    public static final String URL_getAllEmp="http://localhost/Harshit/getAllEmp.php";
    public static final String URL_getEmp="http://localhost/Harshit/getEmp.php";
    public static final String URL_updateEmp="http://localhost/Harshit/updateEmp.php";

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
