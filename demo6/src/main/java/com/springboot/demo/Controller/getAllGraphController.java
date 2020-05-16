package com.springboot.demo.Controller;

import com.springboot.demo.DAO.GexfColor;
import com.springboot.demo.DAO.GexfPosition;
import com.springboot.demo.model.*;
import it.uniroma1.dis.wsngroup.gexf4j.core.EdgeType;
import it.uniroma1.dis.wsngroup.gexf4j.core.Gexf;
import it.uniroma1.dis.wsngroup.gexf4j.core.Graph;
import it.uniroma1.dis.wsngroup.gexf4j.core.Mode;
import it.uniroma1.dis.wsngroup.gexf4j.core.Node;
import it.uniroma1.dis.wsngroup.gexf4j.core.data.Attribute;
import it.uniroma1.dis.wsngroup.gexf4j.core.data.AttributeClass;
import it.uniroma1.dis.wsngroup.gexf4j.core.data.AttributeList;
import it.uniroma1.dis.wsngroup.gexf4j.core.data.AttributeType;
import it.uniroma1.dis.wsngroup.gexf4j.core.impl.GexfImpl;
import it.uniroma1.dis.wsngroup.gexf4j.core.impl.StaxGraphWriter;
import it.uniroma1.dis.wsngroup.gexf4j.core.impl.data.AttributeListImpl;
import it.uniroma1.dis.wsngroup.gexf4j.core.viz.Color;
import it.uniroma1.dis.wsngroup.gexf4j.core.viz.Position;
import org.springframework.stereotype.Controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;
@Controller
public class getAllGraphController {


    public void getgexf(List<Edge> edgess, List<Nodee> nodesss) {
        ArrayList<Integer> source = new ArrayList<>();
        ArrayList<Integer> target = new ArrayList<>();
        ArrayList<Integer> ids = new ArrayList<>();
        ArrayList<Integer> weigh = new ArrayList<>();
        for (int i = 0; i < edgess.size(); i++) {
            Edge X = edgess.get(i);
            source.add(X.getSource() >= 0 ? X.getSource() : -1);
            target.add(X.getTarget() >= 0 ? X.getTarget() : -1);
            ids.add(X.getId() >= 0 ? X.getId() : -1);
            weigh.add(X.getWeight() >= 0 ? X.getId() : -1);


        }
        Gexf gexf = new GexfImpl();
        Calendar date = Calendar.getInstance();

        gexf.getMetadata()
                .setLastModified(date.getTime())
                .setCreator("Gephi.org")
                .setDescription("A Web network");
        gexf.setVisualization(true);

        Graph graph = gexf.getGraph();
        graph.setDefaultEdgeType(EdgeType.UNDIRECTED).setMode(Mode.STATIC);

        AttributeList attrList = new AttributeListImpl(AttributeClass.NODE);
        graph.getAttributeLists().add(attrList);
        Attribute attUrl = attrList.createAttribute("modularity_class", AttributeType.INTEGER, "Modularity Class");
        Attribute attIndegree = attrList.createAttribute("pageranks", AttributeType.DOUBLE, "PageRank");
        ArrayList<Node> aaa = new ArrayList<>();
        for (int i = 0; i < nodesss.size(); i++) {
            Color colorr = new GexfColor();
            Position positionn = new GexfPosition();
            Nodee X = nodesss.get(i);

            colorr.setG(X.getG());
            colorr.setB(X.getB());
            colorr.setR(X.getR());
            positionn.setX(X.getX()).setY(X.getY()).setZ(0.0f);
            Node gephi = graph.createNode(X.getNodeid().toString());
            gephi.setLabel(X.getLabel()).setSize(X.getSize());
            gephi.setColor(colorr);
            gephi.getAttributeValues().addValue(attUrl, X.getValue().toString());
            gephi.setPosition(positionn);
            aaa.add(gephi);
        }
            for (int i = 0; i < source.size(); i++) {
                int sourcee, targett, idss, weightt;
                sourcee = source.get(i);
                targett = target.get(i);
                idss = (ids.get(i) == -1) ? ids.get(i) : -1;
                weightt = (weigh.get(i) == -1) ? weigh.get(i) : -1;
                //  System.out.println(sourcee);

                for (int j = 0; j < aaa.size(); j++) {
           /* System.out.println(aaa.get(j).getId());
            System.out.println(sourcee);
            System.out.println(Integer.parseInt(aaa.get(j).getId())==sourcee);*/
                    if (Integer.parseInt(aaa.get(j).getId()) == sourcee) {
                        for (int k = 0; k < aaa.size(); k++) {  // System.out.println(aaa.get(k).getId().toString());

                            if (Integer.parseInt(aaa.get(k).getId()) == targett) {
                                System.out.println("fucl");


                                if (weightt != -1)
                                    aaa.get(j).connectTo(aaa.get(k)).setWeight(weightt);
                                else aaa.get(j).connectTo(aaa.get(k));
                            }

                        }


                    }


                }

            }


            StaxGraphWriter graphWriter = new StaxGraphWriter();
            File f = new File("D:\\test.static_graph_sample.gexf");
            Writer out;
            try {
                out = new FileWriter(f, false);
                graphWriter.writeToStream(gexf, out, "UTF-8");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}
