public class Browser {
    public void navigate(String address){
        String ip = findIpAddress(address);
        String html = sendHTTPRequest(ip);
        System.out.println(html);
    }

    private String sendHTTPRequest(String ip) {
        return "html";
    }
    private String findIpAddress(String address) {
        return "192.168.1.1";
    }
}
