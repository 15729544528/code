package TuoMin.Service.Service;

import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

/**
 * @功能
 */
@Service
public class SericeIpm implements service{
    public Map<String, Object>  say(){
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("nihao","你好");
        return hashMap;

    }
}
