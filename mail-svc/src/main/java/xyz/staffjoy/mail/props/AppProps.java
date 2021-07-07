package xyz.staffjoy.mail.props;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
@ConfigurationProperties(prefix="staffjoy")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppProps {

    // aliyun directmail props
    @Value("{aliyun-access-key}")
    @NotNull private String aliyunAccessKey;
    @Value("{aliyun-access-secret}")
    @NotNull private String aliyunAccessSecret;

    public String getAliyunAccessKey() {
        return aliyunAccessKey;
    }

    public void setAliyunAccessKey(String aliyunAccessKey) {
        this.aliyunAccessKey = aliyunAccessKey;
    }

    public String getAliyunAccessSecret() {
        return aliyunAccessSecret;
    }

    public void setAliyunAccessSecret(String aliyunAccessSecret) {
        this.aliyunAccessSecret = aliyunAccessSecret;
    }
}
