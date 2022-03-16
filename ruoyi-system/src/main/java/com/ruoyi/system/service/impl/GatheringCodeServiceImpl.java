package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.GatheringCodeUsage;
import com.ruoyi.system.mapper.GatheringCodeMapper;
import com.ruoyi.system.service.IGatheringCodeService;
import com.ruoyi.system.vo.GatheringCodeQueryCondParam;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName GatheringCodeServiceImpl
 * @Description TODO
 * @CreateTime 2022/3/17 00:02
 **/
@Service
public class GatheringCodeServiceImpl implements IGatheringCodeService {

  private static final Logger log = LoggerFactory.getLogger(GatheringCodeServiceImpl.class);

  @Autowired
  GatheringCodeMapper gatheringCodeMapper;

  @Override
  @Transactional(readOnly = true)
  public List<GatheringCodeUsage> findGatheringCodeUsageByPage(GatheringCodeQueryCondParam param) {
    return gatheringCodeMapper.selectGatheringCodeUsageByPage(param);
  }
}
