import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class ReadXml {
    public static void main(String[] args) {
        
        try{
            File inputFile = new File("universitas.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println();
            System.out.println("ELemen Root nya :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("fakultas");
            System.out.println("----------------------------");

            for(int temp=0; temp < nList.getLength(); temp++){
                Node nNode = nList.item(temp);
                System.out.println();
                System.out.println("Elemen Saat ini :" + nNode.getNodeName());

                if(nNode.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element elemen = (Element) nNode;
                    System.out.println("Kode Fakultas :" + elemen.getAttribute("kodefakultas"));
                    System.out.println("Nama Fakultas :" + elemen.getElementsByTagName("nama").item(0).getTextContent());
                    System.out.println("Jumlah Mahasiswa :" + elemen.getElementsByTagName("jumlahmahasiswa").item(0).getTextContent());
                    System.out.println();
                    System.out.println("----------------------------");
                }
            }

        } catch(Exception e){
            e.printStackTrace();
        }

    }
}