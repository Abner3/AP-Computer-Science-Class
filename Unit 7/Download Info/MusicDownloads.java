import java.util.*;

public class MusicDownloads{
    private List<DownloadInfo> downloadList;
    
    public MusicDownloads(){
        downloadList = new ArrayList<DownloadInfo>();
    }
    
    public DownloadInfo getDownloadInfo(String title){
        for (DownloadInfo info : downloadList)
        {
            if (info.getTitle().equals(title))
            {
                return info;
            }
        }
        return null;
    }
    
    public void updateDownloads(List<String> titles){
        for(String title: titles){
            DownloadInfo foundInfo = getDownloadInfo(title);
            if(foundInfo == null){
                downloadList.add(new DownloadInfo(title));
            }else{
                foundInfo.incrementTimesDownloaded();
            }
        }
    }
}
