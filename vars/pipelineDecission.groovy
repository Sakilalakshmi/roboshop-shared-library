#! groovy

def decidePipleine(Map configMap){
    application = configMap.get("application")
    //# here we are getting nodeJSVM
    switch(application) {
        case 'nodeJSVM':
            echo "application is nodeJS and VM based"
            nodeJSVMCI(configMap)
            break
        case 'javaVM':
            javaVMCI(configMap)
            break
        default:
            error "Un recognised application"
            break
    }
    //echo "I need to take decision based on the map you sent"
}