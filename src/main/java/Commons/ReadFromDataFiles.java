package Commons;


import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tools.jackson.databind.ObjectMapper;



public class ReadFromDataFiles {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final String DATA_FILE_PATH = "src/test/resources/TestData/";
    private static final Map<String, Map<String, String>> CACHE = new HashMap<>();

    public static Map<String, String> readData(String fileName) throws Exception {
        if (CACHE.containsKey(fileName)) {
            return CACHE.get(fileName);
        }

        File file = new File(DATA_FILE_PATH + fileName);

        if (!file.exists()) {
            throw new Exception("Data file not found: " + fileName);
        }

        Map<String, String> data = objectMapper.readValue(file, Map.class);
        CACHE.put(fileName, data);
        return data;
    }

    // Clear all cached files
    public static void clearCache() {
        CACHE.clear();
    }

    // Clear cache for a specific file
    public static void clearCache(String fileName) {
        CACHE.remove(fileName);
    }
}