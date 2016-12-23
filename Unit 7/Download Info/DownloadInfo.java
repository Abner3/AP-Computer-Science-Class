public class DownloadInfo{
    private String title;
    private int num;
    
    public DownloadInfo(String title){
        this.title = title;
        num = 1;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void incrementTimesDownloaded(){
        num++;
    }
}