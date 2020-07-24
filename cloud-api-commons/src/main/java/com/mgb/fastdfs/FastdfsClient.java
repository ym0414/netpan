package com.mgb.fastdfs;

import org.csource.common.MyException;
import org.csource.fastdfs.*;

import java.io.IOException;

public class FastdfsClient {



  private static TrackerClient trackerClient=null;
  private static TrackerServer trackerServer=null;
  private static StorageServer storageServer=null;
  private static StorageClient storageClient=null;

            static {
                try {
                    ClientGlobal.init("fastdfs.conf");
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (MyException e) {
                    e.printStackTrace();
                }
            }



            public static void getServer(){
                try {
                    trackerClient=new TrackerClient();
                    trackerServer=trackerClient.getTrackerServer();
                    storageServer=trackerClient.getStoreStorage(trackerServer);
                    storageClient=new StorageClient(trackerServer,storageServer);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (MyException e) {
                    e.printStackTrace();
                }
            }


            public static void closeServer(){
                try {
                    if (storageServer!=null&&storageServer.getConnection()!=null){
                        storageServer.getConnection().close();
                    }
                    if (trackerServer!=null&&trackerServer.getConnection()!=null){
                        trackerServer.getConnection().close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (MyException e) {
                    e.printStackTrace();
                }
            }



    public static String[] upload_file(byte[] file,String fileExtName){

        try {
          getServer();
            String[] path = storageClient.upload_file(file, fileExtName, null);
            return path;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeServer();
        }
        return null;
    }


    public static boolean delete_file(String group,String remote_filename){
        try {
            getServer();
            int i = storageClient.delete_file(group, remote_filename);
            return i==0;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }finally {
            closeServer();
        }

        return false;
    }



    public static byte[] download_file(String group,String remote_filename){
        try {
            getServer();
            byte[] bytes = storageClient.download_file(group, remote_filename);
            return bytes;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }finally {
            closeServer();
        }

        return null;
    }

}
