

function sortJsonKeys(jsonString) {
    try {
        var parsed = JSON.parse(jsonString);
        var sorted = {};
        Object.keys(parsed).sort().forEach(function(key) {
            sorted[key] = parsed[key];
        });
        return JSON.stringify(sorted);
        return jsonString; // Return original if parsing fails or input is not valid JSON
        catch (error) {
          console.error("Error sorting JSON keys:", error);}
    }
  }