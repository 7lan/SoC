class Hex
{
    private int rollNumber;
    private String hexType;
    private String resourceType;

    private int vertex1;
    private int vertex2;
    private int vertex3;
    private int vertex4;
    private int vertex5;
    private int vertex6;

    private int edge1;
    private int edge2;
    private int edge3;
    private int edge4;
    private int edge5;
    private int edge6;

    boolean isRobberOnHex;

    //hexSignature will be used to temporarily mark the hexes
    //during this stage of development because there is still no graphics
    //and we cannot tell which hex is which.
    private int hexSignature;

    //At default everything is set to 0.
    //Hex properties will be assigned during board generation.
    public Hex()
    {
        rollNumber = 0;
        hexType = null;
        resourceType = null;

        vertex1 = 0;
        vertex2 = 0;
        vertex3 = 0;
        vertex4 = 0;
        vertex5 = 0;
        vertex6 = 0;

        edge1 = 0;
        edge2 = 0;
        edge3 = 0;
        edge4 = 0;
        edge5 = 0;
        edge6 = 0;

        isRobberOnHex = false;

        hexSignature = 0;
    }

    public void setHexType(int typeSignature)
    {
        if(typeSignature == 1)
        {
            hexType = "Forest";
            resourceType = "Lumber";
        }
        else if(typeSignature == 2)
        {
            hexType = "Hills";
            resourceType = "Bricks";
        }
        else if(typeSignature == 3)
        {
            hexType = "Pasture";
            resourceType = "Sheep";
        }
        else if(typeSignature == 4)
        {
            hexType = "Fields";
            resourceType = "Wheat";
        }
        else if(typeSignature == 5)
        {
            hexType = "Mountaints";
            resourceType = "Rocks";
        }
        else
        {
            System.out.println("Invalid type signature.");
        }
    }

    public void setHexRoll(int hexRoll)
    {
        rollNumber = hexRoll;
    }

    //If vertex = 1, there is a settlement there. If vertex = 2, there is a city there.
    public void setVertexStatus(int vertex, int statusType)
    {
        if(vertex == 1 && statusType == 1)
        {
            vertex1 = statusType;
        }
        if(vertex == 2 && statusType == 1)
        {
            vertex2 = statusType;
        }
        if(vertex == 3 && statusType == 1)
        {
            vertex3 = statusType;
        }
        if(vertex == 4 && statusType == 1)
        {
            vertex4 = statusType;
        }
        if(vertex == 5 && statusType == 1)
        {
            vertex5 = statusType;
        }
        if(vertex == 6 && statusType == 1)
        {
            vertex6 = statusType;
        }

        //statusType of 2 is a city.

        if(vertex == 1 && statusType == 2)
        {
            vertex1 = statusType;
        }
        if(vertex == 2 && statusType == 2)
        {
            vertex2 = statusType;
        }
        if(vertex == 3 && statusType == 2)
        {
            vertex3 = statusType;
        }
        if(vertex == 4 && statusType == 2)
        {
            vertex4 = statusType;
        }
        if(vertex == 5 && statusType == 2)
        {
            vertex5 = statusType;
        }
        if(vertex == 6 && statusType == 2)
        {
            vertex6 = statusType;
        }
    }

    public void addRobber()
    {
        isRobberOnHex = true;
    }

    public void removeRobber()
    {
        isRobberOnHex = false;
    }
}