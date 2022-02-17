# Add any ProGuard configurations specific to this
# extension here.

-keep public class jea.telemessage.Telemessage {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'jea/telemessage/repack'
-flattenpackagehierarchy
-dontpreverify
