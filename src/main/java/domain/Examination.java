package domain;

import java.util.Date;

/**
 * `source_id` varchar(255) NOT NULL,
 `subject1_time` datetime DEFAULT NULL,
 `subject1_source` int(4) DEFAULT NULL,
 `subject2_time` datetime DEFAULT NULL,
 `subject2_source` int(4) DEFAULT NULL,
 `subject3_time` datetime DEFAULT NULL,
 `subject3_source` int(4) DEFAULT NULL,
 `subject4_time` datetime DEFAULT NULL,
 `subject4_source` int(4) DEFAULT NULL,
 */
public class Examination {
    private String source_id;
    private Date   subject1_time;
    private Integer subject1_source;
    private Date   subject2_time;
    private Integer subject2_source;
    private Date   subject3_time;
    private Integer subject3_source;
    private Date   subject4_time;
    private Integer subject4_source;

}
