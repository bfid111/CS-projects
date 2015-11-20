
import java.util.Comparator;

class GeoReadingAscendingComparator implements Comparator<GeoReading>
{

    @Override
    public int compare( GeoReading o2 , GeoReading o1 )
    {
        /*
        int localDateCompare = o2.localDate.compareTo( o1.localDate );
        if ( localDateCompare != 0 ) { // If not equal on this component, so compare on this.
            return localDateCompare;
        
        }
             
        int magnitudeCompare = o2.magnitude.compareTo( o1.magnitude );
        if ( magnitudeCompare != 0 ) { // If not equal on this component, so compare on this.
            return magnitudeCompare;
        }
             
         int depthCompare = o2.depth.compareTo( o1.depth );
        if ( depthCompare != 0 ) { // If not equal on this component, so compare on this.
            return depthCompare;
        }
                  */  

        int latitudeCompare = o2.latitude.compareTo( o1.latitude );
        if ( latitudeCompare != 0 ) { // If not equal on this component, so compare on this.
            return latitudeCompare;
        }
    
              
        return o2.longitude.compareTo( o1.longitude );

    }
}