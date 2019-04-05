package scratch.testService;

import com.drew.imaging.ImageMetadataReader;
import com.drew.lang.GeoLocation;
import com.drew.metadata.Metadata;
import com.drew.metadata.exif.GpsDirectory;
import org.geonames.Toponym;
import org.geonames.WebService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.Collection;
import java.util.List;

public class ImageTest {

    private static final Logger LOG = LoggerFactory.getLogger(ImageTest.class);


    public  void getLocation() throws Exception {
        File file = ResourceUtils.getFile("classpath:IMG_0305.JPG");
        Metadata metadata = ImageMetadataReader.readMetadata(file);
        Collection<GpsDirectory> gpsDirectories = metadata.getDirectoriesOfType(GpsDirectory.class);
        for (GpsDirectory gpsDirectory : gpsDirectories) {
            GeoLocation geoLocation = gpsDirectory.getGeoLocation();
            if (geoLocation != null && !geoLocation.isZero()) {
                double latitude = geoLocation.getLatitude();
                double longitude = geoLocation.getLongitude();
                WebService.setUserName("scratchapp");
                List<Toponym> country = WebService.findNearbyPlaceName(latitude, longitude);
                break;
            }
        }
    }
}
