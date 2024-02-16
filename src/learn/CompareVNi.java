package learn;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class CompareVNi {
    public static void main(String[] args) {
        List<FullName> names = new ArrayList<>();
        createFakeData(names);

        names.sort((o1, o2) -> {
            var compareFirstName = compareName(o1.first, o2.first);
            if (compareFirstName != 0) {
                return compareFirstName;
            }
            return compareName(o1.last, o2.last);
        });

        for (var item : names) {
            System.out.println(item);
        }
    }

    private static int compareName(String s1, String s2) {
        Collator collator = Collator.getInstance(Locale.forLanguageTag("vi"));
        collator.setStrength(Collator.PRIMARY);
        return collator.compare(s1, s2);
    }


    private static void createFakeData(List<FullName> names) {
        names.add(new FullName("Hoa", "Trần"));
        names.add(new FullName("Hòa", "Trần"));
        names.add(new FullName("Hiên", "Hoàng"));
        names.add(new FullName("Hiên", "Lê"));
        names.add(new FullName("Hiên", "Trần"));
        names.add(new FullName("Hiên", "Nguyễn"));
        names.add(new FullName("Hiên", "Ma"));
        names.add(new FullName("Hưng", "Trần"));
        names.add(new FullName("Hồng", "Trần"));
        names.add(new FullName("Hạnh", "Trần"));
        names.add(new FullName("Hân", "Trần"));
        names.add(new FullName("Hà", "Trần"));
        names.add(new FullName("Duy", "Trần"));
        names.add(new FullName("Đức", "Trần"));
        names.add(new FullName("Đoan", "Trần"));
        names.add(new FullName("Cảnh", "Trần"));
        names.add(new FullName("Trang", "Trần"));
    }

    static class FullName {
        private final String first;
        private final String last;

        public FullName(String first, String last) {
            this.first = first;
            this.last = last;
        }

        @Override
        public String toString() {
            return last + " " + first;
        }
    }
}
