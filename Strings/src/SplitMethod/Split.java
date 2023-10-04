package SplitMethod;

public class Split {

    public static void main(String[] args) {
        String peopleTxt = """
                Jackson Barney,Architect,222.st.block2,CA
                Tim cook,Software developer,st.lucia.333,NV
                Andrew holan,Backen developer,st.Block4.444,UK
                David pitts,Network engineer,upper.block.111,NK
                Mark sid,Studio Manager,st.lucia.999.block6,NK  
                """;
        //first version
        String[] peopleArray = peopleTxt.split("\n");
        System.out.println(peopleArray.length);
        System.out.println(peopleArray[3]);
        String[] david = peopleArray[3].split(",");
        System.out.println(david[2]);

        //Second Version
        String[] peopleArray2 = peopleTxt.split("\n",4);
        System.out.println(peopleArray2.length);
        System.out.println(peopleArray2[3]);
        String[] david2 = peopleArray2[3].split(",");
        System.out.println(david2[2]);


    }
}
