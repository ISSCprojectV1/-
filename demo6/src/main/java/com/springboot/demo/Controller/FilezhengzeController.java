package com.springboot.demo.Controller;
import com.springboot.demo.mapper.EdgeMapper;
import com.springboot.demo.mapper.NodeeMapper;
import com.springboot.demo.model.Edge;
import com.springboot.demo.model.Nodee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Controller
public class FilezhengzeController {
    @Autowired
     private  EdgeMapper edgeMapper;
    @Autowired
    private  NodeeMapper nodeeMapper;

    @ResponseBody
    @RequestMapping(value = "/getuserrr")

    public  void getuserrr()
{


    List<String> strs = new ArrayList<>();
    try
    {
        //编码格式
        String encoding = "UTF-8";
        //文件路径
        File file = new File("D:\\les-miserables.gexf");
        if (file.isFile() && file.exists()){ // 判断文件是否存在
            //输入流
            InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file), encoding);// 考虑到编码格
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt = null;
            String node="node";
            String endnode="\\node";
            String edge="edge";
            String edges="edges";
            String id="id";
            String value="value";
            String r="r";
            String g="g";
            String weight="weight";
            String size="size";
            String b="b";
            String X="x";
            String y="y";
            String z="z";
            String label="label";
            String color="color";


            String position ="position";
            String nodes="nodes";
            String attributes="attributes";
            String attvalue="attvalue";
            String attvalues="attvalues";
            String  defaultedgetype="defaultedgetype";
            String source="source";
            String target="target";
String shuangyinhao="(?<=\").*?(?=\")";
            //读取一行

            int edgecounter=10;
            int nodecounter=10;
            String nodelabel="";
            float nodex=0.0f;
            float nodey=0.0f;
            float nodez=0.0f;
            int noder=0;
            int nodeg=0;
            int nodeb=0;
            float nodesize=1.0f;
            float nodevalue=0.0f;
            int nodeid=-1;
            boolean isnodestart=true;
            boolean isedegestart=true;
            boolean flag=false;
            boolean printnode=true;
            Pattern patternposition=Pattern.compile(position);
            Pattern patterncolor=Pattern.compile(color);
            Pattern patternattvalue=Pattern.compile(attvalue);
            Pattern patternattvalues=Pattern.compile(attvalues);
            Pattern patternvalue = Pattern.compile(value);
            Pattern patternsize = Pattern.compile(size);
            Pattern patternnode = Pattern.compile(node);
            Pattern patternedges=Pattern.compile(edges);
            Pattern patternattirbute= Pattern.compile(attributes);
            Pattern patternnodes=Pattern.compile(nodes);
            Pattern patternedge = Pattern.compile(edge);

            Pattern patternshuagnyinhao=Pattern.compile(shuangyinhao);
            Pattern patterndefaultedgetype=Pattern.compile(defaultedgetype);

            Pattern patternid=Pattern.compile(id);
            Pattern patternsource=Pattern.compile(source);
            Pattern patternstarget=Pattern.compile(target);
            Pattern patternweight = Pattern.compile(weight);
Pattern patternlaber=Pattern.compile(label);
            while ((lineTxt = bufferedReader.readLine()) != null)
            {
                //正则表达式


                Matcher matchernode,macheredges,matcherdefaultedgetype,macheredge,macherattirbute,machernodes
                        ,matcherposition,matcherattvalue,matcherattvalues,
                        matchervalue,matchersize,matcherweight,matchershaungyinhao,matcherid,
                        matchersource,matchertarget,matchercolor,matcherlabel
                        ;



                matchernode = patternnode.matcher(lineTxt);
                macherattirbute=patternattirbute.matcher(lineTxt);
                machernodes=patternnodes.matcher(lineTxt);
                macheredge=patternedge.matcher(lineTxt);
                macheredges=patternedges.matcher(lineTxt);
                matcherdefaultedgetype=patterndefaultedgetype.matcher(lineTxt);


                matcherattvalues    =   patternattvalues.matcher(lineTxt);


                if(matchernode.find())
                {


                    if(!macherattirbute.find()&&!machernodes.find())
                    {

                        if(isnodestart)
                        {
                            String[] splitAddress=lineTxt.split("\\s+");
                            for(int i=0;i<splitAddress.length;i++)
                            {                 matchershaungyinhao =patternshuagnyinhao.matcher(splitAddress[i]);
                                matcherid=patternid.matcher(splitAddress[i]);
                                matcherlabel=patternlaber.matcher(splitAddress[i]);
                                if(matcherid.find())
                                {
                                    if(matchershaungyinhao.find())
                                        nodeid= Integer.parseInt( matchershaungyinhao.group(0));

                                }
                                if(matcherlabel.find())
                                {
                                    if(matchershaungyinhao.find())
                                        nodelabel= matchershaungyinhao.group(0);

                                }
                            }

                            System.out.println(lineTxt);

                        }else
                        {

                        //   Nodee edgee =new Nodee(nodecounter,nodelabel,nodesize,nodex,nodey,nodez,noder,nodeg,nodeb,nodevalue,nodeid);
                        //   nodecounter++;
                        //   nodeeMapper.insert(edgee);
                         nodelabel="";
                          nodex=0.0f;
                       nodey=0.0f;
                        nodez=0.0f;
                            noder=0;
                             nodeg=0;
                          nodeb=0;
                       nodesize=1.0f;
                        nodevalue=0.0f;
                         nodeid=-1;

                        }

                  //   如果输出来了 isnode start变成了false
                        isnodestart=!isnodestart;
//这时候flag变成了true 但是如果输出的话
                        if(!isnodestart)
                        {

                            flag=true;
                        }

                        if(isnodestart)
                            flag=false;
                        continue;
                    }

                }

             else if(macheredge.find())
                {    int edgeid =-1;
                    int edgesource=-1;
                    int edgetarget=-1;
                    float edgeweight=1.0f;
                    if(!matcherdefaultedgetype.find()&&!macheredges.find())
                   {
                       if(isedegestart)
                   {
                         String[] splitAddress=lineTxt.split("\\s+");
                         for(int i=0;i<splitAddress.length;i++)
                         {


                             matcherweight=patternweight.matcher(splitAddress[i]);
                             matchershaungyinhao =patternshuagnyinhao.matcher(splitAddress[i]);
                      matcherid=patternid.matcher(splitAddress[i]);
                       matchersource=patternsource.matcher(splitAddress[i]);;
                           matchertarget=patternstarget.matcher( splitAddress[i]);

                             if(matcherweight.find())
                             {
                                 if(matchershaungyinhao.find())
                                edgeweight= Float.parseFloat( matchershaungyinhao.group(0));

                             }

                             if(matcherid.find())
                             {
                                 if(matchershaungyinhao.find())
                         edgeid=Integer.parseInt(matchershaungyinhao.group(0));
                             }
                             if(matchersource.find())
                             {
                                 if(matchershaungyinhao.find())
                                    edgesource=Integer.parseInt(matchershaungyinhao.group(0));

                             }
                             if(matchertarget.find())
                             {
                                 if(matchershaungyinhao.find())
                                     edgetarget=Integer.parseInt(matchershaungyinhao.group(0));

                             }

                         }
                       Edge edgee =new Edge(edgecounter,edgeid==-1?null:edgeid,edgesource,edgetarget,edgeweight);
                       edgeMapper.insert(edgee);
                       edgecounter++;
                         }

                      }


                        isedegestart=!isedegestart;
                   }




               if(flag)
               {
                   matchercolor=patterncolor.matcher(lineTxt);
                   matcherposition=patternposition.matcher(lineTxt);
                   matchersize=patternsize.matcher(lineTxt);
                   matcherattvalue=patternattvalue.matcher(lineTxt);
                   if(!matcherattvalues.find())
                   {

                  if (matchersize.find())
                       {
                           matchershaungyinhao =patternshuagnyinhao.matcher(lineTxt);
                         matchershaungyinhao.find();
                           nodesize=Float.parseFloat(matchershaungyinhao.group(0));
                           }
                       if (matcherattvalue.find())
                       {
                           matchershaungyinhao =patternshuagnyinhao.matcher(lineTxt);

                           //这个地方数据格式为a
                           matchershaungyinhao.find();
                           matchershaungyinhao.find();
                           matchershaungyinhao.find();
                           nodevalue=Float.parseFloat(matchershaungyinhao.group(0));
                       }
                       if (matcherposition.find())
                       {
                           //        <viz:position x="437.939" y="291.58234" z="0.0"></viz:position>
                           //第一次匹配的是X的值，第二次就是y=第三次才是y的值 所以这么操作了
                           matchershaungyinhao =patternshuagnyinhao.matcher(lineTxt);
                           matchershaungyinhao.find();
                           nodex=Float.parseFloat(matchershaungyinhao.group(0));

                           matchershaungyinhao.find();
                           matchershaungyinhao.find();
                           nodey=Float.parseFloat(matchershaungyinhao.group(0));
                       }
                       if (matchercolor.find())
                       {

                           matchershaungyinhao =patternshuagnyinhao.matcher(lineTxt);
                           matchershaungyinhao.find();
                           noder=Integer.parseInt(matchershaungyinhao.group(0));
                           matchershaungyinhao.find();
                           matchershaungyinhao.find();
                           nodeg=Integer.parseInt(matchershaungyinhao.group(0));
                           matchershaungyinhao.find();
                           matchershaungyinhao.find();
                           nodeb=Integer.parseInt(matchershaungyinhao.group(0));
                       }
                       System.out.println(lineTxt);

                   }



               }




            }
            read.close();
        }
        else
        {
            System.out.println("找不到指定的文件");
        }
    }
    catch (Exception e)
    {
        System.out.println("读取文件内容出错");
        e.printStackTrace();
    }

}


}
