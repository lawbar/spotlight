package swt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.sf.json.JSONObject;

import com.drew.imaging.ImageMetadataReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;

import java.awt.SystemColor;

public class Sss extends JFrame{
    private static final long serialVersionUID = 9128268608313906363L;
    private JFrame frame;
    private JLabel imagelabel; 
    private JPanel imagepanel ;
    private JFileChooser filechooser;
    protected JFrame fileframe;
    private File file ;
    private String filepath;
    private static JTextField txtSs;
    private static JTextField textField_1;
    private static JTextField textField_2;
    private static JTextField textField_3;
    private JTextField textField;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_7;
    private JTextField textField_12;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Sss window = new Sss();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Sss() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        imagepanel = new JPanel();  
        imagelabel = new JLabel();  
        JButton btnPicture = new JButton("照片");
        frame.getContentPane().setLayout(null);
        btnPicture.setBounds(10, 264, 85, 30);  
        frame.getContentPane().add(btnPicture);
        imagepanel.setBounds(0, 0, 434, 244);  
        frame.getContentPane().add(imagepanel);
        imagepanel.add(imagelabel);
        
        JPanel panel = new JPanel();
        panel.setForeground(Color.BLACK);
        panel.setBounds(10, 304, 400, 45);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("拍摄地点:");
        lblNewLabel.setBounds(0, 10, 56, 25);
        lblNewLabel.setBackground(SystemColor.textHighlight);
        lblNewLabel.setForeground(Color.DARK_GRAY);
        panel.add(lblNewLabel);
        
        txtSs = new JTextField();
        txtSs.setEditable(false);
        txtSs.setBounds(63, 10, 337, 25);
        txtSs.setForeground(Color.BLACK);
        panel.add(txtSs);
        txtSs.setColumns(10);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setForeground(Color.BLACK);
        panel_1.setBounds(10, 348, 400, 45);
        frame.getContentPane().add(panel_1);
        
        JLabel label = new JLabel("天气:");
        label.setForeground(Color.DARK_GRAY);
        label.setBounds(0, 10, 52, 25);
        panel_1.add(label);
        
        textField_1 = new JTextField();
        textField_1.setEditable(false);
        textField_1.setForeground(Color.BLACK);
        textField_1.setColumns(10);
        textField_1.setBounds(61, 10, 339, 25);
        panel_1.add(textField_1);
        
        JPanel panel_2 = new JPanel();
        panel_2.setLayout(null);
        panel_2.setForeground(Color.BLACK);
        panel_2.setBounds(10, 392, 400, 45);
        frame.getContentPane().add(panel_2);
        
        JLabel label_1 = new JLabel("地理信息:");
        label_1.setForeground(Color.DARK_GRAY);
        label_1.setBounds(0, 10, 65, 25);
        panel_2.add(label_1);
        
        textField_2 = new JTextField();
        textField_2.setEditable(false);
        textField_2.setForeground(Color.BLACK);
        textField_2.setColumns(10);
        textField_2.setBounds(64, 10, 336, 25);
        panel_2.add(textField_2);
        
        JPanel panel_3 = new JPanel();
        panel_3.setLayout(null);
        panel_3.setForeground(Color.BLACK);
        panel_3.setBounds(10, 436, 400, 45);
        frame.getContentPane().add(panel_3);
        
        JLabel label_2 = new JLabel("拍摄时间:");
        label_2.setForeground(Color.DARK_GRAY);
        label_2.setBounds(0, 10, 57, 25);
        panel_3.add(label_2);
        
        textField_3 = new JTextField();
        textField_3.setEditable(false);
        textField_3.setForeground(Color.BLACK);
        textField_3.setColumns(10);
        textField_3.setBounds(67, 10, 333, 25);
        panel_3.add(textField_3);
        
        JPanel panel_4 = new JPanel();
        panel_4.setLayout(null);
        panel_4.setForeground(Color.BLACK);
        panel_4.setBounds(10, 480, 400, 45);
        frame.getContentPane().add(panel_4);
        
        JLabel label_3 = new JLabel("曝光时间:");
        label_3.setForeground(Color.DARK_GRAY);
        label_3.setBounds(0, 10, 69, 25);
        panel_4.add(label_3);
        
        textField = new JTextField();
        textField.setForeground(Color.BLACK);
        textField.setEditable(false);
        textField.setColumns(10);
        textField.setBounds(72, 10, 108, 25);
        panel_4.add(textField);
        
        textField_8 = new JTextField();
        textField_8.setForeground(Color.BLACK);
        textField_8.setEditable(false);
        textField_8.setColumns(10);
        textField_8.setBounds(260, 10, 108, 25);
        panel_4.add(textField_8);
        
        JLabel label_8 = new JLabel("光圈系数:");
        label_8.setForeground(Color.DARK_GRAY);
        label_8.setBounds(190, 10, 60, 25);
        panel_4.add(label_8);
        
        JPanel panel_5 = new JPanel();
        panel_5.setLayout(null);
        panel_5.setForeground(Color.BLACK);
        panel_5.setBounds(10, 524, 400, 45);
        frame.getContentPane().add(panel_5);
        
        JLabel label_4 = new JLabel("快门速度:");
        label_4.setForeground(Color.DARK_GRAY);
        label_4.setBounds(0, 10, 69, 25);
        panel_5.add(label_4);
        
        textField_4 = new JTextField();
        textField_4.setForeground(Color.BLACK);
        textField_4.setEditable(false);
        textField_4.setColumns(10);
        textField_4.setBounds(73, 10, 106, 25);
        panel_5.add(textField_4);
        
        JLabel label_9 = new JLabel("光圈数值:");
        label_9.setForeground(Color.DARK_GRAY);
        label_9.setBounds(189, 10, 60, 25);
        panel_5.add(label_9);
        
        textField_9 = new JTextField();
        textField_9.setForeground(Color.BLACK);
        textField_9.setEditable(false);
        textField_9.setColumns(10);
        textField_9.setBounds(259, 10, 108, 25);
        panel_5.add(textField_9);
        
        JPanel panel_6 = new JPanel();
        panel_6.setLayout(null);
        panel_6.setForeground(Color.BLACK);
        panel_6.setBounds(10, 568, 400, 45);
        frame.getContentPane().add(panel_6);
        
        JLabel label_5 = new JLabel("亮度:");
        label_5.setForeground(Color.DARK_GRAY);
        label_5.setBounds(0, 10, 57, 25);
        panel_6.add(label_5);
        
        textField_5 = new JTextField();
        textField_5.setForeground(Color.BLACK);
        textField_5.setEditable(false);
        textField_5.setColumns(10);
        textField_5.setBounds(75, 10, 107, 25);
        panel_6.add(textField_5);
        
        textField_10 = new JTextField();
        textField_10.setForeground(Color.BLACK);
        textField_10.setEditable(false);
        textField_10.setColumns(10);
        textField_10.setBounds(259, 12, 107, 25);
        panel_6.add(textField_10);
        
        JLabel label_10 = new JLabel("曝光补偿:");
        label_10.setForeground(Color.DARK_GRAY);
        label_10.setBounds(192, 10, 57, 25);
        panel_6.add(label_10);
        
        JPanel panel_7 = new JPanel();
        panel_7.setLayout(null);
        panel_7.setForeground(Color.BLACK);
        panel_7.setBounds(10, 617, 400, 45);
        frame.getContentPane().add(panel_7);
        
        JLabel label_6 = new JLabel("焦距:");
        label_6.setForeground(Color.DARK_GRAY);
        label_6.setBounds(0, 10, 54, 25);
        panel_7.add(label_6);
        
        textField_6 = new JTextField();
        textField_6.setForeground(Color.BLACK);
        textField_6.setEditable(false);
        textField_6.setColumns(10);
        textField_6.setBounds(75, 10, 106, 25);
        panel_7.add(textField_6);
        
        JLabel label_11 = new JLabel("曝光模式:");
        label_11.setForeground(Color.DARK_GRAY);
        label_11.setBounds(191, 10, 60, 25);
        panel_7.add(label_11);
        
        textField_11 = new JTextField();
        textField_11.setForeground(Color.BLACK);
        textField_11.setEditable(false);
        textField_11.setColumns(10);
        textField_11.setBounds(261, 10, 107, 25);
        panel_7.add(textField_11);
        
        JPanel panel_8 = new JPanel();
        panel_8.setBounds(104, 243, 308, 62);
        frame.getContentPane().add(panel_8);
        panel_8.setLayout(null);
        
        JLabel label_7 = new JLabel("拍摄设备:");
        label_7.setForeground(Color.DARK_GRAY);
        label_7.setBackground(SystemColor.textHighlight);
        label_7.setBounds(10, 10, 56, 25);
        panel_8.add(label_7);
        
        textField_7 = new JTextField();
        textField_7.setForeground(Color.BLACK);
        textField_7.setEditable(false);
        textField_7.setColumns(10);
        textField_7.setBounds(74, 10, 154, 25);
        panel_8.add(textField_7);
        
        JLabel label_12 = new JLabel("照片大小:");
        label_12.setForeground(Color.DARK_GRAY);
        label_12.setBackground(SystemColor.textHighlight);
        label_12.setBounds(10, 35, 56, 25);
        panel_8.add(label_12);
        
        textField_12 = new JTextField();
        textField_12.setForeground(Color.BLACK);
        textField_12.setEditable(false);
        textField_12.setColumns(10);
        textField_12.setBounds(74, 35, 154, 25);
        panel_8.add(textField_12);
        
        btnPicture.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {//查找图片文件并显示  
                fileframe  = new JFrame();  
                filechooser = new JFileChooser();  
                if(filechooser.showOpenDialog(fileframe)==JFileChooser.APPROVE_OPTION ){  
                    filepath=filechooser.getSelectedFile().getAbsolutePath();
                    file = filechooser.getSelectedFile();
                    
                    frame.setTitle(file.getName());
                    //System.out.println(filepath);                   
                    imagepanel.add(imagelabel);
                    
                    //每次调用前先设置空
                    txtSs.setText("");
                    textField_1.setText("");
                    textField_2.setText("");
                    textField_3.setText("");
                    textField_4.setText("");
                    textField_5.setText("");
                    textField_6.setText("");
                    textField_7.setText("");
                    textField_8.setText("");
                    textField_9.setText("");
                    textField_10.setText("");
                    textField_11.setText("");
                    textField_12.setText("");
                    
                    InputStream input = null ;
                    byte b[] = new byte[(int)file.length()] ;//定义一个用于接收字符串的数组
                    try{
                        input = new FileInputStream(file) ;
                        input.read(b) ;//读取
                        input.close() ;
                    }catch(Exception e2){
                        e2.printStackTrace() ;
                    }
                    ImageIcon icon=new ImageIcon(b);
                    //等比缩放条件  
                  double imgWidth=icon.getIconWidth();  
                  double imgHeight=icon.getIconHeight();  
                  double conWidth=imagepanel.getWidth();  
                  double conHeight=imagepanel.getHeight();  
                  double reImgWidth;  
                  double reImgHeight;  
                  if(imgWidth/imgHeight>=conWidth/conHeight){  
                      if(imgWidth>conWidth){  
                          reImgWidth=conWidth;  
                         reImgHeight=imgHeight*(reImgWidth/imgWidth);  
                      }else{  
                          reImgWidth=imgWidth;  
                          reImgHeight=imgHeight;  
                      }  
                  }else{  
                      if(imgWidth>conWidth){  
                          reImgHeight=conHeight;  
                          reImgWidth=imgWidth*(reImgHeight/imgHeight);  
                      }else{  
                          reImgWidth=imgWidth;  
                          reImgHeight=imgHeight;  
                      }  
                  }
                  
                  //解释exif文件
                  try {
                      //File file = new File(filepath);
                      Metadata metadata = ImageMetadataReader.readMetadata(file);
                      //纬度
                      String longitude ="";
                      //经度
                      String latitude ="";
                      //海拔
                      String altitude = "";
                      //拍摄时间
                      String time="";
                      String make = "";
                      String model="";
                      for (Directory directory : metadata.getDirectories()) {  
                          for (Tag tag : directory.getTags()) {  
                             String tagName = tag.getTagName();  //标签名
                             String desc = tag.getDescription(); //标签信息
                             if (tagName.equals("Date/Time Original")) {  
                                 //拍摄时间
                                 time = desc;
                             }else if (tagName.equals("GPS Latitude")) {
                                 //纬度
                                 latitude = desc;
                                 System.out.println("纬度"+desc);
                             } else if (tagName.equals("GPS Longitude")) {  
                                 //经度
                                 longitude = desc;
                                 System.out.println("经度"+desc);
                              }else if(tagName.equals("Exposure Time")) {
                                  textField.setText(desc);
                            }else if (tagName.equals("F-Number")) {
                                textField_8.setText(desc);
                            }else if (tagName.equals("Shutter Speed Value")) {
                                textField_4.setText(desc);
                            }else if (tagName.equals("Aperture Value")) {
                                textField_9.setText(desc);
                            }else if (tagName.equals("Brightness Value")) {
                                textField_5.setText(desc);
                            }else if (tagName.equals("Exposure Bias Value")) {
                                textField_10.setText(desc);
                            }else if (tagName.equals("Focal Length")) {
                                textField_6.setText(desc);
                            }else if (tagName.equals("Exposure Mode")) {
                                textField_11.setText(desc);
                            }else if (tagName.equals("Make")) {
                                make=desc;
                            }else if (tagName.equals("Model")) {
                                model=desc;
                            }else if (tagName.equals("GPS Altitude")) {
                                altitude=desc;
                            }else if (tagName.equals("File Size")) {
                                textField_12.setText(desc.substring(0, desc.length()-5)+"字节");
                            }
                           }  
                        }
                      //拍摄设备
                      textField_7.setText(make+model);
                      
                      //调用查询地址方法,设置值
                      List<String> add = queryAdd(pointToLatlong(latitude)+","+pointToLatlong(longitude));
                      txtSs.setText("国家:"+add.get(0)+"省:"+add.get(2)+"城市:"+add.get(3)+"街道:"+add.get(4));
                      System.out.println(add.get(1));
                      
                      //根据城市编码,调用查询天气方法
                      List<String> weather = queryWeather(time,add.get(1));
                     
                      if (weather.size()==0) {
                          textField_1.setText("没有相关的天气信息!");
                      }else {
                          textField_1.setText("温度:"+weather.get(0)+"天气:"+weather.get(1));
                    }
                      textField_2.setText("纬度:"+latitude+"经度:"+longitude+"海拔:"+altitude.substring(0, altitude.length()-6)+"米");
                      textField_3.setText(time);
                } catch (Exception e1) {
                    txtSs.setText("该照片没有exif信息!");
                }  
                  imagelabel.setIcon(icon=new ImageIcon(icon.getImage().getScaledInstance((int)reImgWidth, (int)reImgHeight, Image.SCALE_DEFAULT)));  
                } 
            }  
        });
    }
    
    
    /**
     * 经纬度转换  度分秒转换
     * @param point 坐标点
     * @return
     */
    public String pointToLatlong (String point )throws Exception {
        Double du = Double.parseDouble(point.substring(0, point.indexOf("°")).trim());
        Double fen = Double.parseDouble(point.substring(point.indexOf("°")+1, point.indexOf("'")).trim());
        Double miao = Double.parseDouble(point.substring(point.indexOf("'")+1, point.indexOf("\"")).trim());
        Double duStr = du + (fen / 60) + (miao / 60 / 60) ;
        return duStr.toString();
    }
    
    
    /**
     * 根据百度地图API查找拍照所在地
     * @param add 经纬度
     * @return 地址和城市集合
     */
    public static List<String> queryAdd(String add){
        try {
            List<String> list = new ArrayList<String>();
            String url = "http://api.map.baidu.com/geocoder/v2/?ak=mOwz3YsOqYW92rzFti8mhOC3aDQ8aN0F&coordtype=wgs84ll&location="+add+"&output=json";
            StringBuilder json = new StringBuilder();
                    URL oracle = new URL(url);
                    URLConnection yc = oracle.openConnection();
                    BufferedReader in = new BufferedReader(new InputStreamReader(
                                                yc.getInputStream()));
                    String inputLine = null;
                    while ( (inputLine = in.readLine()) != null) {
                        json.append(inputLine);
                    }
                    in.close();
                    JSONObject jsonData = JSONObject.fromObject(json.toString());
                    String ad = JSONObject.fromObject(jsonData.getString("result")).getString("addressComponent");
                    JSONObject data = JSONObject.fromObject(ad);
                    String country = data.getString("country");
                    String city = data.getString("city");
                    String province = data.getString("province");
                    String street = data.getString("street");
                    //String address= "国家:"+country+"省:"+province+"城市:"+city+"街道:"+street;
                    //String code = JSONObject.fromObject(jsonData.getString("result")).getString("cityCode");
                    list.add(new String(country.getBytes(), "utf-8"));
                    list.add(city.substring(0,city.length()-1));
                    list.add(new String(province.getBytes(), "utf-8"));
                    list.add(new String(city.getBytes(), "utf-8"));
                    list.add(new String(street.getBytes(), "utf-8"));
                    return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }  
    
    /**
     * 调用天气查询接口查天气
     * @param times 时间
     * @param citynm 城市名
     * @return
     */
    public static List<String> queryWeather(String time,String citynm){
        List<String> weather2 = new ArrayList<String>();
        String request = time.replaceAll(":", "-").substring(0, 10);
        //http://api.k780.com:88/?app=weather.history&weaid=1&date=2015-07-20&appkey=10003&sign=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json
        String url = "http://api.k780.com:88/?app=weather.history&weaid="+citynm+"&date="+request+"&appkey=20485&sign=e48bc8f15db15ad8cff50477384391d4&format=json";
        StringBuilder json;
        String temperature="";
        String weather="";
        try {
            json = new StringBuilder();
            URL oracle = new URL(url);
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                                        yc.getInputStream()));
            String inputLine = null;
            while ( (inputLine = in.readLine()) != null) {
                json.append(inputLine);
            }
            in.close();
            JSONObject jsonData = JSONObject.fromObject(json.toString());
            String result = jsonData.getString("result");
            String substring = result.substring(1, result.length()-1);
            JSONObject fromObject = JSONObject.fromObject(substring);
            temperature = fromObject.getString("temperature");
            weather = fromObject.getString("weather");
            System.out.println("天气回调:"+json.toString());
            
            weather2.add(temperature);
            weather2.add(weather);
            
            return weather2;
        } catch (Exception e) {
            
        }
        return weather2;
    }
    /*public static void main(String[] args) {
        String a = "{\"result\":[{\"aqi\": \"101\",\"cityid\": \"101010100\"}]}";
        JSONObject jsonData = JSONObject.fromObject(a);
        String string = jsonData.getString("result");
        String substring = string.substring(1, string.length()-1);
        JSONObject fromObject = JSONObject.fromObject(substring);
        String temperature = fromObject.getString("temperature");
        String weather = fromObject.getString("weather");
        //JSONObject fromObject = JSONObject.fromObject(string);
        //System.out.println(fromObject.toString());
             
        
        StringBuilder json;
        try {
            json = new StringBuilder();
            URL oracle = new URL("http://api.k780.com:88/?app=weather.history&cityid=101010100&date=2016-08-02&appkey=20485&sign=e48bc8f15db15ad8cff50477384391d4&format=json");
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                                        yc.getInputStream()));
            String inputLine = null;
            while ( (inputLine = in.readLine()) != null) {
                json.append(inputLine);
            }
            in.close();
            JSONObject jsonData = JSONObject.fromObject(json.toString());
            String reslut = jsonData.getString("result");
            String substring = reslut.substring(1, reslut.length()-1);
            JSONObject fromObject = JSONObject.fromObject(substring);
            String temperature = fromObject.getString("temperature");
            String weather = fromObject.getString("weather");
            System.out.println(temperature+weather);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        String weather = queryWeather("2016:08:08", "广州");
        System.out.println(weather);
        
        List<String> queryAdd = queryAdd("39.983424,116.322987");
        String string = queryWeather("2016:08:02",queryAdd.get(1));
        System.out.println("城市:"+queryAdd.get(1)+"天气:"+string);
    }*/
    
    /*public static void main(String[] args) throws ImageProcessingException, IOException {
            
            File file = new File("D:/IMG_0708.JPG");
            Metadata metadata = ImageMetadataReader.readMetadata(file);
            
            for (Directory directory : metadata.getDirectories()) {  
                for (Tag tag : directory.getTags()) {  
                   String tagName = tag.getTagName();  //标签名
                   String desc = tag.getDescription(); //标签信息
                   System.out.println(tagName+"------"+desc);
                }
            }
        }*/
}
